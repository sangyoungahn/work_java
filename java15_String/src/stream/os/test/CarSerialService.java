package stream.os.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CarSerialService {
	public void outputCar(String file, ArrayList<Car> list) throws Exception {	//직렬화...
		File f = new File(file);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
		oos.writeObject(list);
		oos.close();
	}
	
	public ArrayList<Car> inputCar(String path) throws Exception {
		ArrayList<Car> list = null;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		
		return (ArrayList<Car>)ois.readObject();
		
	}
 }
