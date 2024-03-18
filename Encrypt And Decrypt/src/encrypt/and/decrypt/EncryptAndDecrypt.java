
package encrypt.and.decrypt;

/**
 *
 * @author Legendary Proo
 */
public class EncryptAndDecrypt
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Encrypting the message
        int Encryptor = 2;
        String Message = "\"Ceeqwpv\"pwodgt\"jcu\"pqvjkpi\"qp\"kv\"lwuv\"jcxkpi\"c\"nkvvng\"vjkpi\"yjkej\"yknn\"pqv\"ncuv\"wu\"hqtgxgt";
        
        
        // code for Encrypting
        char[] Chars = Message.toCharArray();
        for(char A : Chars){
            // for Encrypting is only +=
            A -= Encryptor;
            System.out.print(A);
        }
    }
    
}
