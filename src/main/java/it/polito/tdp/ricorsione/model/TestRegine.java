package it.polito.tdp.ricorsione.model;

import java.util.List;

public class TestRegine {

	public static void main(String[] args) {
		RegineSoluzione1 r = new RegineSoluzione1();
		List<Integer> soluzioni = r.cercaRegine(15);
		System.out.println(soluzioni);
	}

}
