import java.io.*;
import java.util.Scanner;

import jdk.internal.org.jline.utils.InputStreamReader;

public class SecretMessage {

    public static void encrypt( String inputFilem, String outputFile, int key ) throws IOException, FileNotFoundException {

        InputStreamReader input = new InputStreamReader(new FileInputStream(inputFilem));
        

        OutputStream output = new FileOutputStream("data");
        
        File f = new File(outputFile);
        OutputStream output = new FileOutputStream(f);

        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(outputFile));

        String encryptedMessege= new String();
        
        out.write(encryptedMessege);




        // YOUR CODE HERE (remove the exception)

    }
	
	public static void decrypt( String inputFilem, String outputFile, int key ) throws IOException, FileNotFoundException {
        throw new UnsupportedOperationException("SecretMessage decrypt not implemented");
        // YOUR CODE HERE (remove the exception)


    }

    public static void main( String[] args ) {

        if ( args.length != 4 ) {
            System.out.println( "Usage: java SecretMessage [encrypt|decrypt] inputFile OutputFile key" );
            System.exit( 0 );
        }

		if(args[0].equals("encrypt")){

		
            try {
                encrypt( args[1],args[2], Integer.parseInt(args[3]));
            } catch ( FileNotFoundException e ) {
                System.err.println( "File not found: "+e.getMessage() );
            } catch (IOException e) {
                System.err.println( "Cannot read/write file: "+e.getMessage() );
            }
		}
		else if(args[0].equals("decrypt")){

		
            try {
                decrypt( args[1],args[2], Integer.parseInt(args[3]));
            } catch ( FileNotFoundException e ) {
                System.err.println( "File not found: "+e.getMessage() );
            } catch (IOException e) {
                System.err.println( "Cannot read/write file: "+e.getMessage() );
            }
        }
		else{
			System.out.println( "Usage: java SecretMessage [encrypt|decrypt] inputFile OutputFile key" );
            System.exit( 0 );
		}
        
    }
}