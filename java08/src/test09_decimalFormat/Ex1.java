package test09_decimalFormat;

import java.io.File;
import java.text.DecimalFormat;

public class Ex1 {

	public static void main(String[] args) {
		view("c:\\work", "exe");
	}

//	static void view(String path, String name) {
//		File file = new File(path);
//		File[] arr = file.listFiles();
//		
//		String fileName, fileType;
//		int typePoint;
//		
//		for (File f : arr) {
//			if (f.isDirectory()) {
//				view(f.getPath(), name);
//			} else if (f.isFile()) {
//				
//				typePoint = f.getName().lastIndexOf('.');
//				fileType = f.getName().substring(typePoint + 1);
//				
//				if (fileType.equals(name)) {
//					System.out.println(f.getPath());
//				}
//			}
//		}
//	}
	static void view(String path, String name) {
		class Temp {
			int cnt, size;

			Temp() {
				this.cnt = this.size = 0;
			}

			void view(String path) {
				File file = new File(path);
				File[] arr = file.listFiles();

				for (File f : arr) {
					if (f.isDirectory()) {
						view(f.getPath());
					} else if (f.getName().endsWith(name)) {
						System.out.println(f.getPath());
						size += f.length();
						cnt++;
					}
				}
			}
		}
		
		Temp temp = new Temp();
		temp.view( path );
		
		DecimalFormat fmt = new DecimalFormat("###,###.##");
		String st = fmt.format( temp.size / Math.pow(2,20) );
		
		System.out.printf( "count=%d, size=%sMb", temp.cnt, st );

	}

}
