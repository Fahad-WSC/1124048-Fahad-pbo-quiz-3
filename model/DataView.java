package model;

import java.util.ArrayList;
import java.util.List;

abstract class DataView<T> {
    private List<T> records;

    public DataView() {
        this.records = new ArrayList<>();
    }

    public void printAll() {
        String[] dataFields = this.getFields();
        String[] values = this.convertModelToValues(records);
    }
    public void printByPk(T records) {
    }
    public void showInsertForm(T records) {
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




