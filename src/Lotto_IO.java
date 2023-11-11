import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//write 메서드는 파일에 로또를 기록하는 함수
//read 메서드는 파일에 있는 로또를 출력하는 함수


class Lotto_Fcn{
	
	
	
	
	
	void read() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			
			br = new BufferedReader(new FileReader("C:\\Temp\\Lotto.java"));
			bw = new BufferedWriter(new FileWriter("C:\\Temp\\Lotto.txt"));
			
			String line = "";
			for(int i=0; (line=br.readLine()) != null; i++) {
				bw.write(line);
				bw.newLine();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	
}

public class Lotto_IO {

	public static void main(String[] args) {
		
		
		
		
		
	}

}
