package JdbcUtils;

public class QueryBuilder {
	 //��������� 
  	public static String getHeader (int documentId){
  		String temp = "SELECT * FROM t_Ven WHERE ChID="+documentId;
  		return temp;
  	}
  	//�����
  	public static String getProduct (int documentId){
  		String temp =  "SELECT * FROM t_VenA WHERE ChID="+documentId;
  		return temp;
  	}
  	//������
  	public static String getProductBatch (int documentId){
  		String temp =  "SELECT * FROM t_VenD WHERE ChID="+documentId;
  		return temp;
  	}
  	//���� ��������
  	public static String getPackType (int documentId){
  		String temp =  "SELECT * FROM t_VenD_UM WHERE ChID="+documentId;
  		return temp;
  	}
  	//������� 
  	public static String getProductRoutes (int documentId){
  		String temp =  "SELECT * FROM t_VenRoutes WHERE ChID="+documentId;
  		return temp;
  	}
  	//�������
  	public static String getProductSpends (int documentId){
  		String temp = "SELECT * FROM t_VenSpends WHERE ChID="+documentId;
  		return temp;
  	}
  	//�������������� ����������
  	public static String getUnknownBarCodes (int documentId){
  		String temp =  "SELECT * FROM t_VenUnknBarCodes WHERE ChID="+documentId;
  		return temp;
  	}
  	//�������������� ��������
  	public static String getProductImbalance(int documentId){
  		String temp =  "SELECT * FROM t_VenDiscrepancyRecordsRem WHERE ChID="+documentId;
  		return temp;
  	}
  	
}
