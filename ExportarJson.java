import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ExportarJson {
    public void ExportarJsonV(ArrayList<ObjVehiculos> lv) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("Vehiculos.json")) {
            gson.toJson(lv, writer);
            System.out.println("Vehiculos exportado correctamente a Vehiculos.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ExportarJsonC(ArrayList<ObjClientes> lc) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("Cl.json")) {
            gson.toJson(lc, writer);
            System.out.println("Cliente exportado correctamente a Clientes.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ExportarJsonCo(ArrayList<ContratoRenting> lcontratos) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("Contratos.json")) {
            gson.toJson(lcontratos, writer);
            System.out.println("Contrato exportado correctamente a Contratos.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}