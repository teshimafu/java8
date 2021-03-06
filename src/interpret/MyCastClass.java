package interpret;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MyCastClass {

	public static Object castStringToAny(Class<?> c, String input) {
		if (c.isInstance(input))
			return c.cast(input);
		else {
			return getCastValue(c, input);
		}
	}

	public static Object[] castStringToArray(Class<?> c, String input) {
		ArrayList<Object> results = new ArrayList<Object>();
		String castedStr = input.substring(input.indexOf("{") + 1);
		int dotIndex;
		while ((dotIndex = castedStr.indexOf(",")) != -1) {
			String tempStr = castedStr.substring(0, dotIndex);
			results.add(getCastValue(c, tempStr));
			castedStr = castedStr.substring(dotIndex + 1);
		}
		return results.toArray();

	}

	private static Object getCastValue(Class<?> c, String input) {
		Object result;
		try {
			result = castPrimitive(c, input);
		} catch (NumberFormatException e) {
			return null;
		}
		if (result == null) {
			if (c.isEnum())
				result = castEnum(c, input);
			else
				try {
					result = castClass(c, input);
				} catch (IllegalArgumentException | IllegalAccessException e) {
					result = null;
				}
		}
		return result;
	}

	private static Object castPrimitive(Class<?> c, String input) throws NumberFormatException {
		if (c.isAssignableFrom(int.class)) {
			return Integer.parseInt(input);
		} else if (c.isAssignableFrom(float.class)) {
			return Float.parseFloat(input);
		} else if (c.isAssignableFrom(double.class)) {
			return Double.parseDouble(input);
		} else if (c.isAssignableFrom(byte.class)) {
			return Byte.parseByte(input);
		} else if (c.isAssignableFrom(short.class)) {
			return Short.parseShort(input);
		} else if (c.isAssignableFrom(boolean.class)) {
			return Boolean.parseBoolean(input);
		} else if (c.isAssignableFrom(long.class)) {
			return Long.parseLong(input);
		} else if (c.isAssignableFrom(char.class) && (input.length() == 1)) {
			char[] ch = input.toCharArray();
			return ch[0];
		} else
			return null;
	}

	private static Object castEnum(Class<?> c, String input) {
		Object enumObjects[] = c.getEnumConstants();

		for (Object obj : enumObjects) {
			if (obj.toString().equals(input))
				return obj;
		}
		return null;
	}

	private static Object castClass(Class<?> c, String input) throws IllegalArgumentException, IllegalAccessException {
		Field objects[] = c.getFields();

		for (Field obj : objects) {
			if (obj.getName().equals(input))
				return obj.get(null);
		}
		return null;
	}

}
