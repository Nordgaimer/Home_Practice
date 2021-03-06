package JdbcUtils;

public class XMLDescriptionMaker {
	public static String TablesDesc = "<dict>\n"
			+ "<tablesource>\n"
			+ "<tablesource id=\"100\" name=\"t_Ven\" desc=\"���������\"/>\n"
			+ "<tablesource id=\"101\" name=\"t_VenA\" desc=\"�����\"/>\n"
			+ "<tablesource id=\"102\" name=\"t_VenD\" desc=\"������\"/>\n"
			+ "<tablesource id=\"103\" name=\"t_VenD_UM\" desc=\"���� ��������\"/>\n"
			+ "<tablesource id=\"104\" name=\"t_VenRoutes\" desc=\"�������\"/>\n"
			+ "<tablesource id=\"104\" name=\"t_VenSpends\" desc=\"�������\"/>\n"
			+ "<tablesource id=\"105\" name=\"t_VenUnknBarCodes\" desc=\"����������� ���������\"/>\n"
			+ "<tablesource id=\"106\" name=\"t_VenDiscrepancyRecordsRem\" desc=\"�������������� �������� �������\"/>\n"
			+ "<tablesource id=\"107\" name=\"t_Ven\" desc=\"���������\"/>\n"
			+"</tablesource>";
	public static String FieldsDesc = "<tablefields>\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"2\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"3\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"4\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"5\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"6\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"7\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"8\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"9\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"10\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"11\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
			+ "<field id=\"1\" name=\"ChID\"  desc=\"��� �����������\"\n"
		
			
			+ "";

	public static String addRusDesc (String columnName){
		if (columnName.equals("ChID")) {
			return " description=\"��� �����������\"";
		}
		if (columnName.equals("DocID")) {
			return " description=\"a\"";
		}
		if (columnName.equals("DocDate")) {
			return " description=\"����\"";
		}
		if (columnName.equals("KursMC")) {
			return " description=\"������\"";
		}
		if (columnName.equals("OurID")) {
			return " description=\"�����\"";
		}
		if (columnName.equals("StockID")) {
			return " description=\"�����\"";
		}
		if (columnName.equals("CodeID1")) {
			return " description=\"������� 1\"";
		}
		if (columnName.equals("CodeID2")) {
			return " description=\"������� 2\"";
		}
		if (columnName.equals("CodeID3")) {
			return " description=\"������� 3\"";
		}
		if (columnName.equals("CodeID4")) {
			return " description=\"������� 4\"";
		}
		if (columnName.equals("CodeID5")) {
			return " description=\"������� 5\"";
		}
		if (columnName.equals("EmpID")) {
			return " description=\"��������\"";
		}
		if (columnName.equals("Notes")) {
			return " description=\"����������\"";
		}
		if (columnName.equals("IntDocID")) {
			return " description=\"��� �����\"";
		}
		if (columnName.equals("CompID")) {
			return " description=\"�����������\"";
		}
		if (columnName.equals("Discount")) {
			return " description=\"������\"";
		}
		if (columnName.equals("SrcDocID")) {
			return " description=\"����� ���������\"";
		}
		if (columnName.equals("SrcDocDate")) {
			return " description=\"���� ���������\"";
		}
		if (columnName.equals("CurrID")) {
			return " description=\"������\"";
		}
		if (columnName.equals("TSumCC_nt")) {
			return " description=\"����� ��� ���\"";
		}
		if (columnName.equals("TTaxSum")) {
			return " description=\"����� ���\"";
		}
		if (columnName.equals("TSumCC_wt")) {
			return " description=\"����� � ���\"";
		}
		if (columnName.equals("TNewSumCC_nt")) {
			return " description=\"��� ����� ��� ���\"";
		}
		if (columnName.equals("TNewTaxSum")) {
			return " description=\"��� ����� ���\"";
		}
		if (columnName.equals("TNewSumCC_wt")) {
			return " description=\"��� ����� � ���\"";
		}
		if (columnName.equals("TSpendSumCC")) {
			return " description=\"����� ������ ��\"";
		}
		if (columnName.equals("TRouteSumCC")) {
			return " description=\"����� �������� ��\"";
		}
		if (columnName.equals("StateCode")) {
			return " description=\"������\"";
		}
		return "" ;
				
	}
	

}
