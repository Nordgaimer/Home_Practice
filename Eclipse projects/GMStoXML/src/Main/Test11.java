package Main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Test11{


		  public static void main(String[] args) {

		        Task11 task = new Task11("abcd");
		        task.print1();
		        task.print2();
		        task.print3();
		    }

		    private final String value;

		    public Task11(String value) {
		        this.value = value;
		    }

		    public void print1() {
		        System.out.println("'" + value + "'");
		    }


		    public void print2() {
		        System.out.println("\"" + value + "\"");
		    }

		    public void print3() {
		        System.out.println("|" + value + "|");
		    }

}