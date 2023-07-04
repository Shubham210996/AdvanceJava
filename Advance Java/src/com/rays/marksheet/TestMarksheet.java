package com.rays.marksheet;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {
	public static void main(String[] args) throws Exception {
//		testFindByRollNumber(449);
//	    testSearch();
//		testSearchPara();
		testSelect();
	}

	private static void testSelect() throws Exception {
		MarksheetModal md = new MarksheetModal();
		md.selectMethod();

	}

	public static void testSearchPara() throws Exception {
		MarksheetBean bean1 = new MarksheetBean();
		MarksheetModal modal = new MarksheetModal();
		bean1.setNumber(2);
		List list = modal.SearchbyParameter(bean1);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			bean1 = (MarksheetBean) it.next();
			System.out.print(bean1.getNumber());
			System.out.print("\t" + bean1.getRollNumber());
			System.out.print("\t" + bean1.getName());
			System.out.print("\t" + bean1.getHindi());
			System.out.print("\t" + bean1.getEnglish());
			System.out.print("\t" + bean1.getPhysics());
			System.out.print("\t" + bean1.getChemistry());
			System.out.println("\t" + bean1.getMaths());
		}
	}

	private static void testFindByRollNumber(int roll_no) throws Exception {
		MarksheetModal md = new MarksheetModal();

		MarksheetBean bn = md.findByRollNumber(roll_no);

		if (bn != null) {
			System.out.print(bn.getNumber());
			System.out.print("\t" + bn.getRollNumber());
			System.out.print("\t" + bn.getName());
			System.out.print("\t" + bn.getHindi());
			System.out.print("\t" + bn.getEnglish());
			System.out.print("\t" + bn.getPhysics());
			System.out.print("\t" + bn.getChemistry());
			System.out.println("\t" + bn.getMaths());
		} else {
			System.out.println("Roll Number does not Exist in our Database");
		}
	}

	public static void testSearch() throws Exception {
		MarksheetModal modal = new MarksheetModal();

		// modal.insertMethod(bean);
		List list = modal.Search();
		Iterator it = list.iterator();
		while (it.hasNext()) {

			MarksheetBean bean1 = (MarksheetBean) it.next();

			System.out.print(bean1.getNumber());
			System.out.print("\t" + bean1.getRollNumber());
			System.out.print("\t" + bean1.getName());
			System.out.print("\t" + bean1.getHindi());
			System.out.print("\t" + bean1.getEnglish());
			System.out.print("\t" + bean1.getPhysics());
			System.out.print("\t" + bean1.getChemistry());
			System.out.println("\t" + bean1.getMaths());

		}
	}
}
