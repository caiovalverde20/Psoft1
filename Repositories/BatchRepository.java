package Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Models.Batch;

public class BatchRepository {

    private Map<String,Batch> batches;
	
	public BatchRepository() {
		this.batches = new HashMap<String,Batch>();
	}
	
	public void addBatch(Batch batch) {
		batches.put(batch.getId(), batch);
	}
	
	public void deleteBatch(String id) {
		batches.remove(id);
	}
	
	public void editBatch(Batch batch) {
		batches.replace(batch.getId(), batch);
	}
	
	public Batch getBatch(String id) {
		return batches.get(id);
	}
	
	public ArrayList<Batch> listBatches() {
		ArrayList<Batch> list = new ArrayList<Batch>();
		
		for(Batch batch: batches.values()) {
			list.add(batch);			
		}
		
		return list;
	}
    
}
