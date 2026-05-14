package com.nusummit.main;

import com.nusummit.main.domain.HP3234;
import com.nusummit.main.domain.Printer;

public class PrinterMain {
	public static void main(String[] args) {
		Printer printer = new HP3234();
		printer.doPrinting();
	}
}
