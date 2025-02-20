import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        File f;
        FileReader fr;
        BufferedReader br;
        String linea = "";

        f = new File("fichero.txt");
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while((linea = br.readLine()) != null){
                String[] triangulo = linea.split(" ");
                creaTriangulo(triangulo);//crea e imprime el triángulo
            }
        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

    private static void creaTriangulo(String[] triangulo) {
        int largo = Integer.parseInt(triangulo[0]);
        String letra = triangulo[1];
        String lineaTriangulo = "";
        for (int x=1; x<=largo; x++){
            lineaTriangulo = "";

            for (int y=1; y<largo-x+1; y++){//inserta los sitios en blanco a la izquierda
                lineaTriangulo += "-";
            }

            for (int y=1; y<=x+(x-1); y++){//inserta las letras
                lineaTriangulo += letra;
            }

            for (int y=1; y<largo-x+1; y++){//inserta los sitios en blanco a la derecha
                lineaTriangulo += "-";
            } 

            System.out.println(lineaTriangulo);
        }
    }
}
