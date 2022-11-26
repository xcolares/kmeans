import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.clusterers.SimpleKMeans;
/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            DataSource src = new DataSource("C:/Program Files/Weka-3-8-6/data/cpu.arff");
            Instances dt = src.getDataSet();
            SimpleKMeans model = new SimpleKMeans();
            model.setMaxIterations(20);
            model.setNumClusters(10);
            model.buildClusterer(dt);
            System.out.println(model);


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}