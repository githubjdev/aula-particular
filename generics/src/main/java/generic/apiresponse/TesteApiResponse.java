package generic.apiresponse;

public class TesteApiResponse {
	
	 public static void main(String[] args) {
	        ApiResponse<String> resp = new ApiResponse<>(true, "Operação OK");
	        System.out.println(resp);
	    }

}
