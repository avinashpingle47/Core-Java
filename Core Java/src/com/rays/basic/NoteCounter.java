package com.rays.basic;

public class NoteCounter {
	public static void main(String[] args) {
		int money = 8880;
		int[] notes = { 500, 200, 100, 50, 20, 10 };
		for (int note : notes) {
			int count = money / note;
			if (count > 0) {
				System.out.println(note+ "=" + count);
				money = money % note;
			}
		}
	}
}
