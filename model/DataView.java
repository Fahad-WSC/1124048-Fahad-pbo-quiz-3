package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class DataView<T> {
    private List<T> records;

    public DataView() {
        this.records = new ArrayList<>();
    }

    public void printAll() {
        String[] dataFields = this.getFields();

        for(int i = 0 ; i < this.records.size(); i++){
        T record = this.records.get(i);
        String[] values = this.convertModelToValues(record);
        
            for(int j = 0; j < dataFields.length; j++){
            System.out.print(dataFields[j]+ "," + values[j]);
            }
        }
    }


    public void printByPk(String primaryKey) {
        String[] dataFields = this.getFields();

       for(int i = 0 ; i < this.records.size(); i++){
        T record = this.records.get(i);
        String[] values = this.convertModelToValues(record);
        }


            
        
    }



    public void showInsertForm(T records) {
        String[] dataFields = this.getFields();
        String[] values = new String[dataFields.length];

        for(int i = 0; i <dataFields.length; i++){
            Scanner scanner = new Scanner(System.in);

            System.out.println(dataFields[i] + ":");
            String nim = scanner.nextLine();
            String nama = scanner.nextLine();
            String email = scanner.nextLine();
            int umur = scanner.nextInt();
        }





    }
    public void showUpdateForm(T records) {
    }
    public void promtDelete(T records) {
    }

    protected abstract String getPrimaryKeyValue(T data);

    protected abstract String[] getFields();

    protected abstract T convertValuesToModel(String[] values);

    protected abstract String[] convertModelToValues(T data);
}




