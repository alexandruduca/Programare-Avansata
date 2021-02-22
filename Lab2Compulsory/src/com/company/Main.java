package com.company;

public class Main {

    public static void main(String[] args) {

	Source S1=new Source();
	Source S2=new Source();
	Source S3=new Source();

	S1.setName("S1");
	S1.setType("FACTORY");
	S1.setCapacity(10);

	S2.setName("S2");
	S2.setType("WAREHOUSE");
	S2.setCapacity(35);

	S3.setName("S3");
	S3.setType("WAREHOUSE");
	S3.setCapacity(25);

	Destination D1=new Destination();
	Destination D2=new Destination();
	Destination D3=new Destination();

	D1.setName("D1");
	D1.setCapacity(20);

	D2.setName("D2");
	D2.setCapacity(25);

	D3.setName("D3");
	D3.setCapacity(25);

	Problem P=new Problem(3, 3);
	int[][] matrix= {
			{2, 3, 1},
			{5, 4, 8},
			{5, 6, 8}
	};

	P.setMatrix(matrix);
	P.getMatrix();

    }
}
