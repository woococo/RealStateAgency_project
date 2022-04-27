package realStateAgency;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class realStateAgency {
	
	static int[] monthlyPrice  = new int[64];
	static int[] monthlyPricePerArea = new int[64];
	static int[] tradeAmount = new int[64];
	static double[] monthlyArea  = new double[64];
	static String[] yearMonth = new String[64];
	
	
	static HashSet<String> hsYearMonth = new HashSet<String>();
	static List<String> yearMonthList; 
	
	// 월평균 면적당 가격
	static void makeMonthlyPricePerArea() {
		for (int i = 0; i < monthlyPrice.length; i++) {
			monthlyPricePerArea[i] = (int) Math.round((monthlyPrice[i] / monthlyArea[i] * 3.3));
		}
	}
	
	//연월 리스트 작성
	static void makeMonthList() {
		int cnt = 0;
		for (int i = 2017; i < 2023; i++) {
			for (int j = 1; j < 13; j++) {
				if (i == 2022 && j == 5) break;
				if (j < 10) {
					yearMonth[cnt] = String.valueOf(i) + String.valueOf("0"+j);
				} else {
					yearMonth[cnt] = String.valueOf(i) + String.valueOf(j);
				}
				cnt++;
			}
		}
	}
	
	//월별 시세와 면적의 합계
	static void sumMonthlyPriceAndArea (String[] a, String b, String c, String d) {
		b.trim(); c.trim(); d.trim();
		switch (Integer.valueOf(b)) {
			case 201701: monthlyPrice[0] += Integer.valueOf(c); monthlyArea[0] += Double.parseDouble(d); tradeAmount[0]++; break;
			case 201702: monthlyPrice[1] += Integer.valueOf(c); monthlyArea[1] += Double.parseDouble(d); tradeAmount[1]++; break;
			case 201703: monthlyPrice[2] += Integer.valueOf(c); monthlyArea[2] += Double.parseDouble(d); tradeAmount[2]++; break;
			case 201704: monthlyPrice[3] += Integer.valueOf(c); monthlyArea[3] += Double.parseDouble(d); tradeAmount[3]++; break;
			case 201705: monthlyPrice[4] += Integer.valueOf(c); monthlyArea[4] += Double.parseDouble(d); tradeAmount[4]++; break;
			case 201706: monthlyPrice[5] += Integer.valueOf(c); monthlyArea[5] += Double.parseDouble(d); tradeAmount[5]++; break;
			case 201707: monthlyPrice[6] += Integer.valueOf(c); monthlyArea[6] += Double.parseDouble(d); tradeAmount[6]++; break;
			case 201708: monthlyPrice[7] += Integer.valueOf(c); monthlyArea[7] += Double.parseDouble(d); tradeAmount[7]++; break;
			case 201709: monthlyPrice[8] += Integer.valueOf(c); monthlyArea[8] += Double.parseDouble(d); tradeAmount[8]++; break;
			case 201710: monthlyPrice[9] += Integer.valueOf(c); monthlyArea[9] += Double.parseDouble(d); tradeAmount[9]++; break;
			case 201711: monthlyPrice[10] += Integer.valueOf(c); monthlyArea[10] += Double.parseDouble(d); tradeAmount[10]++; break;
			case 201712: monthlyPrice[11] += Integer.valueOf(c); monthlyArea[11] += Double.parseDouble(d); tradeAmount[11]++; break;
			
			case 201801: monthlyPrice[12] += Integer.valueOf(c); monthlyArea[12] += Double.parseDouble(d); tradeAmount[12]++; break;
			case 201802: monthlyPrice[13] += Integer.valueOf(c); monthlyArea[13] += Double.parseDouble(d); tradeAmount[13]++; break;
			case 201803: monthlyPrice[14] += Integer.valueOf(c); monthlyArea[14] += Double.parseDouble(d); tradeAmount[14]++; break;
			case 201804: monthlyPrice[15] += Integer.valueOf(c); monthlyArea[15] += Double.parseDouble(d); tradeAmount[15]++; break;
			case 201805: monthlyPrice[16] += Integer.valueOf(c); monthlyArea[16] += Double.parseDouble(d); tradeAmount[16]++; break;
			case 201806: monthlyPrice[17] += Integer.valueOf(c); monthlyArea[17] += Double.parseDouble(d); tradeAmount[17]++; break;
			case 201807: monthlyPrice[18] += Integer.valueOf(c); monthlyArea[18] += Double.parseDouble(d); tradeAmount[18]++; break;
			case 201808: monthlyPrice[19] += Integer.valueOf(c); monthlyArea[19] += Double.parseDouble(d); tradeAmount[19]++; break;
			case 201809: monthlyPrice[20] += Integer.valueOf(c); monthlyArea[20] += Double.parseDouble(d); tradeAmount[20]++; break;
			case 201810: monthlyPrice[21] += Integer.valueOf(c); monthlyArea[21] += Double.parseDouble(d); tradeAmount[21]++; break;
			case 201811: monthlyPrice[22] += Integer.valueOf(c); monthlyArea[22] += Double.parseDouble(d); tradeAmount[22]++; break;
			case 201812: monthlyPrice[23] += Integer.valueOf(c); monthlyArea[23] += Double.parseDouble(d); tradeAmount[23]++; break;
			
			case 201901: monthlyPrice[24] += Integer.valueOf(c); monthlyArea[24] += Double.parseDouble(d); tradeAmount[24]++; break;
			case 201902: monthlyPrice[25] += Integer.valueOf(c); monthlyArea[25] += Double.parseDouble(d); tradeAmount[25]++; break;
			case 201903: monthlyPrice[26] += Integer.valueOf(c); monthlyArea[26] += Double.parseDouble(d); tradeAmount[26]++; break;
			case 201904: monthlyPrice[27] += Integer.valueOf(c); monthlyArea[27] += Double.parseDouble(d); tradeAmount[27]++; break;
			case 201905: monthlyPrice[28] += Integer.valueOf(c); monthlyArea[28] += Double.parseDouble(d); tradeAmount[28]++; break;
			case 201906: monthlyPrice[29] += Integer.valueOf(c); monthlyArea[29] += Double.parseDouble(d); tradeAmount[29]++; break;
			case 201907: monthlyPrice[30] += Integer.valueOf(c); monthlyArea[30] += Double.parseDouble(d); tradeAmount[30]++; break;
			case 201908: monthlyPrice[31] += Integer.valueOf(c); monthlyArea[31] += Double.parseDouble(d); tradeAmount[31]++; break;
			case 201909: monthlyPrice[32] += Integer.valueOf(c); monthlyArea[32] += Double.parseDouble(d); tradeAmount[32]++; break;
			case 201910: monthlyPrice[33] += Integer.valueOf(c); monthlyArea[33] += Double.parseDouble(d); tradeAmount[33]++; break;
			case 201911: monthlyPrice[34] += Integer.valueOf(c); monthlyArea[34] += Double.parseDouble(d); tradeAmount[34]++; break;
			case 201912: monthlyPrice[35] += Integer.valueOf(c); monthlyArea[35] += Double.parseDouble(d); tradeAmount[35]++; break;
			
			case 202001: monthlyPrice[36] += Integer.valueOf(c); monthlyArea[36] += Double.parseDouble(d); tradeAmount[36]++; break;
			case 202002: monthlyPrice[37] += Integer.valueOf(c); monthlyArea[37] += Double.parseDouble(d); tradeAmount[37]++; break;
			case 202003: monthlyPrice[38] += Integer.valueOf(c); monthlyArea[38] += Double.parseDouble(d); tradeAmount[38]++; break;
			case 202004: monthlyPrice[39] += Integer.valueOf(c); monthlyArea[39] += Double.parseDouble(d); tradeAmount[39]++; break;
			case 202005: monthlyPrice[40] += Integer.valueOf(c); monthlyArea[40] += Double.parseDouble(d); tradeAmount[40]++; break;
			case 202006: monthlyPrice[41] += Integer.valueOf(c); monthlyArea[41] += Double.parseDouble(d); tradeAmount[41]++; break;
			case 202007: monthlyPrice[42] += Integer.valueOf(c); monthlyArea[42] += Double.parseDouble(d); tradeAmount[42]++; break;
			case 202008: monthlyPrice[43] += Integer.valueOf(c); monthlyArea[43] += Double.parseDouble(d); tradeAmount[43]++; break;
			case 202009: monthlyPrice[44] += Integer.valueOf(c); monthlyArea[44] += Double.parseDouble(d); tradeAmount[44]++; break;
			case 202010: monthlyPrice[45] += Integer.valueOf(c); monthlyArea[45] += Double.parseDouble(d); tradeAmount[45]++; break;
			case 202011: monthlyPrice[46] += Integer.valueOf(c); monthlyArea[46] += Double.parseDouble(d); tradeAmount[46]++; break;
			case 202012: monthlyPrice[47] += Integer.valueOf(c); monthlyArea[47] += Double.parseDouble(d); tradeAmount[47]++; break;
			
			case 202101: monthlyPrice[48] += Integer.valueOf(c); monthlyArea[48] += Double.parseDouble(d); tradeAmount[48]++; break;
			case 202102: monthlyPrice[49] += Integer.valueOf(c); monthlyArea[49] += Double.parseDouble(d); tradeAmount[49]++; break;
			case 202103: monthlyPrice[50] += Integer.valueOf(c); monthlyArea[50] += Double.parseDouble(d); tradeAmount[50]++; break;
			case 202104: monthlyPrice[51] += Integer.valueOf(c); monthlyArea[51] += Double.parseDouble(d); tradeAmount[51]++; break;
			case 202105: monthlyPrice[52] += Integer.valueOf(c); monthlyArea[52] += Double.parseDouble(d); tradeAmount[52]++; break;
			case 202106: monthlyPrice[53] += Integer.valueOf(c); monthlyArea[53] += Double.parseDouble(d); tradeAmount[53]++; break;
			case 202107: monthlyPrice[54] += Integer.valueOf(c); monthlyArea[54] += Double.parseDouble(d); tradeAmount[54]++; break;
			case 202108: monthlyPrice[55] += Integer.valueOf(c); monthlyArea[55] += Double.parseDouble(d); tradeAmount[55]++; break;
			case 202109: monthlyPrice[56] += Integer.valueOf(c); monthlyArea[56] += Double.parseDouble(d); tradeAmount[56]++; break;
			case 202110: monthlyPrice[57] += Integer.valueOf(c); monthlyArea[57] += Double.parseDouble(d); tradeAmount[57]++; break;
			case 202111: monthlyPrice[58] += Integer.valueOf(c); monthlyArea[58] += Double.parseDouble(d); tradeAmount[58]++; break;
			case 202112: monthlyPrice[59] += Integer.valueOf(c); monthlyArea[59] += Double.parseDouble(d); tradeAmount[59]++; break;
			
			case 202201: monthlyPrice[60] += Integer.valueOf(c); monthlyArea[60] += Double.parseDouble(d); tradeAmount[60]++; break;
			case 202202: monthlyPrice[61] += Integer.valueOf(c); monthlyArea[61] += Double.parseDouble(d); tradeAmount[61]++; break;
			case 202203: monthlyPrice[62] += Integer.valueOf(c); monthlyArea[62] += Double.parseDouble(d); tradeAmount[62]++; break;
			case 202204: monthlyPrice[63] += Integer.valueOf(c); monthlyArea[63] += Double.parseDouble(d); tradeAmount[63]++; break;
		}
	}
	
	//파일작성저장
	static void fileSave() throws IOException {
		File k26_f1 = new File("C:\\Users\\kopo\\Desktop\\sbsb\\crawling220425\\monthlyData.csv"); // 이 파일을 열기, 없으면 새로 만듦
		BufferedWriter k26_bw1 = new BufferedWriter (new FileWriter(k26_f1)); // 새로 만든 파일의 내용을 한 줄 씩 추가
		
		k26_bw1.write("계약년월, 거래금액(만원), 전용면적, 월별3.3면적당거래금액(만원), 거래량"); 
		k26_bw1.newLine();
		
		for (int i = 0; i < yearMonth.length; i++) {
			StringBuffer sb = new StringBuffer();
			sb.append(yearMonth[i] + ",");
			sb.append(monthlyPrice[i] + ",");
			sb.append(monthlyArea[i] + ",");
			sb.append(monthlyPricePerArea[i] + ",");
			sb.append(tradeAmount[i]); 
			k26_bw1.write(sb.toString()); k26_bw1.newLine();
		}
		
		k26_bw1.close(); // 작성한 파일 닫기
	}
	
	static List sortingHashSet(HashSet a) {
		// Set을 List로 변환 
		List yearMonthList = new ArrayList(a); 
		// List 정렬 
		Collections.sort(yearMonthList);
		return yearMonthList;
	}
	
	//파일읽기 & 계약연월, 연월금액, 연월면적 합계구하기
	public static void fileRead() throws IOException {
		File file = new File("C:\\Users\\kopo\\Desktop\\sbsb\\crawling220425\\아파트(매매)__실거래가_17_22.csv");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String readcsv;

		if((readcsv = br.readLine()) == null) {	
			System.out.println("빈 파일입니다");
		}
		
		while ((readcsv = br.readLine()) != null) {
			// 문장의 가공하는 객체 생성 및 인스턴스 생성
			String[] field = readcsv.split(",");
			hsYearMonth.add(field[6]);
			sumMonthlyPriceAndArea(yearMonth, field[6], field[8], field[5]);
		}
		br.close(); // 읽은 파일 닫기
	}
	
	public static void main(String[] args) throws IOException {
		makeMonthList();
		fileRead();
		makeMonthlyPricePerArea();
		yearMonthList = sortingHashSet(hsYearMonth);
		fileSave();
	}
}