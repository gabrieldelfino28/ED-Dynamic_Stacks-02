package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
		// TODO Auto-generated constructor stub
		super();
	}

	PilhaInt p = new PilhaInt();

	public long FuncFat(int N) {
		if (N == 1) {
			p.push(N);
			long Fat = 1;
			try {
				while (!p.isEmpty()) {
					Fat *= p.pop();
						
				}
			} catch (Exception e) {	}
			
			return Fat;
		}
		p.push(N);
		N -= 1;
		return FuncFat(N);
	}
}
