import java.io.*;
public class FileTestUser {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		User user = new User();
        user.setId(1);
        user.setNome("Bart Simpson");
        user.setObservacao("Personagem de desenho animado.");
 
		 		escrever(user);
	}
	
	public static void escrever (User user) throws IOException{
		FileWriter arq = new FileWriter("d:\\test2.txt");
		 
         PrintWriter printWriter = new PrintWriter(arq);

         //Agora vamos escrever no arquivo com o método  println(),
         // que nos permite escrever linha a linha no arquivo
         printWriter.println(user.getId());
         printWriter.println(user.getNome());
         printWriter.println(user.getObservacao());

         //o método flush libera a escrita no arquivo
         printWriter.flush();

         //No final precisamos fechar o arquivo
         printWriter.close();
		}

}
