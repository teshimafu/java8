package gui.ex11;

public class NumberSeg {
	static final int BASEX = 0;//時計を記述する最初の座標x
	static final int BASEY = 0;//時計を記述する最初の座標y
	public static int MAGNI = 5;//数字の倍率を設定する

	public final static int tempsega[][]
			= {{1*MAGNI+BASEX,2*MAGNI+BASEX,10*MAGNI+BASEX,11*MAGNI+BASEX,10*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX},
					{1*MAGNI+BASEY,2*MAGNI+BASEY,2*MAGNI+BASEY,1*MAGNI+BASEY,0*MAGNI+BASEY,0*MAGNI+BASEY,1*MAGNI+BASEY}};

	public final static int tempsegb[][]
			= {{11*MAGNI+BASEX,10*MAGNI+BASEX,10*MAGNI+BASEX,11*MAGNI+BASEX,12*MAGNI+BASEX,12*MAGNI+BASEX,11*MAGNI+BASEX},
					{1*MAGNI+BASEY,2*MAGNI+BASEY,10*MAGNI+BASEY,11*MAGNI+BASEY,10*MAGNI+BASEY,2*MAGNI+BASEY,1*MAGNI+BASEY}};

	public final static int tempsegc[][]
			= {{11*MAGNI+BASEX,10*MAGNI+BASEX,10*MAGNI+BASEX,11*MAGNI+BASEX,12*MAGNI+BASEX,12*MAGNI+BASEX,11*MAGNI+BASEX},
					{11*MAGNI+BASEY,12*MAGNI+BASEY,20*MAGNI+BASEY,21*MAGNI+BASEY,20*MAGNI+BASEY,12*MAGNI+BASEY,11*MAGNI+BASEY}};

	public final static int tempsegd[][]
			= {{1*MAGNI+BASEX,2*MAGNI+BASEX,10*MAGNI+BASEX,11*MAGNI+BASEX,10*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX},
					{21*MAGNI+BASEY,22*MAGNI+BASEY,22*MAGNI+BASEY,21*MAGNI+BASEY,20*MAGNI+BASEY,20*MAGNI+BASEY,21*MAGNI+BASEY}};

	public final static int tempsege[][]
			= {{1*MAGNI+BASEX,2*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX,0*MAGNI+BASEX,0*MAGNI+BASEX,1*MAGNI+BASEX},
					{11*MAGNI+BASEY,12*MAGNI+BASEY,20*MAGNI+BASEY,21*MAGNI+BASEY,20*MAGNI+BASEY,12*MAGNI+BASEY,11*MAGNI+BASEY}};

	public final static int tempsegf[][]
			= {{1*MAGNI+BASEX,2*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX,0*MAGNI+BASEX,0*MAGNI+BASEX,1*MAGNI+BASEX},
					{1*MAGNI+BASEY,2*MAGNI+BASEY,10*MAGNI+BASEY,11*MAGNI+BASEY,10*MAGNI+BASEY,2*MAGNI+BASEY,1*MAGNI+BASEY}};

	public final static int tempsegg[][]
			= {{1*MAGNI+BASEX,2*MAGNI+BASEX,10*MAGNI+BASEX,11*MAGNI+BASEX,10*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX},
					{11*MAGNI+BASEY,12*MAGNI+BASEY,12*MAGNI+BASEY,11*MAGNI+BASEY,10*MAGNI+BASEY,10*MAGNI+BASEY,11*MAGNI+BASEY}};

	public final static int tempsegColonHigh[][]
			= {{1*MAGNI+BASEX,0*MAGNI+BASEX,1*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX},
					{5*MAGNI+BASEY,6*MAGNI+BASEY,7*MAGNI+BASEY,6*MAGNI+BASEY,5*MAGNI+BASEY}};

	public final static int tempsegColonLow[][]
			= {{1*MAGNI+BASEX,0*MAGNI+BASEX,1*MAGNI+BASEX,2*MAGNI+BASEX,1*MAGNI+BASEX},
					{15*MAGNI+BASEY,16*MAGNI+BASEY,17*MAGNI+BASEY,16*MAGNI+BASEY,15*MAGNI+BASEY}};
}
