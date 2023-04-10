import net.openio.jrocksDb.db.*;

public class DBTest {

    public static void main(String[] args) {
        JRocksDB jRocksDB=OptimisticTransactionDB.createDB();

        jRocksDB.createColumnFamily("luoluo", Key.KeyType.intKey, Value.ValueType.intValue);

        for(int i=0;i<1024*1024;i++) {

            Status status=jRocksDB.put(new IntKey(i), new IntValue(i), "luoluo");


        }


       System.out.println(jRocksDB.get(new IntKey(997),"luoluo"));


    }
}
