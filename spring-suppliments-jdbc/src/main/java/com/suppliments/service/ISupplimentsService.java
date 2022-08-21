import java.util.List;

import com.suppliments.model.Suppliments;

public interface ISupplimentsService {

	void addSuppliments(String productName);
	void updateSuppliments(int productId,double price);
	void deleteSuppliment(int productId);
	
	List<Suppliments> getAll();
	List<Suppliments> getByType(String type);
	List<Suppliments> getByProductId(int productId);
	
}
