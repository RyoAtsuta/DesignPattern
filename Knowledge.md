# Design Pattern Knowledge
## Case1: 取得したデータを異なる場所に情報を送る
### 想定
- データ活用する際に、データを集めてそれを異なるストレージへ送信するケースを想定

### Note
- Observerはプレゼンテーション層として扱ったほうが実装がしやすいそうだ。

```

public class Main
{
    public static void main(String args[])
    {
        Collector collector1 = new CollectFromDatabase();
        Collector collector2 = new CollectFromS3("/path/to/data1");
        Collector collector3 = new CollectFromS3("/path/to/data2");
        Collector collector4 = new CollectFromCloudFront();

        collector1.addObserver(new ExcelObserver());
        collector1.addObserver(new S3Observer());
        collector1.addObserver(new DataMartObserver1());
        collector1.addObserver(new DataMartObserver2());
        collector1.addObserver(new DataMartObserver3());

        collector2.addObserver(new ExcelObserver());
        collector2.addObserver(new S3Observer());
        collector2.addObserver(new DataMartObserver1());
        collector2.addObserver(new DataMartObserver2());
        collector2.addObserver(new DataMartObserver3());

        collector3.addObserver(new ExcelObserver());
        collector3.addObserver(new S3Observer());
        collector3.addObserver(new DataMartObserver1());
        collector3.addObserver(new DataMartObserver2());
        collector3.addObserver(new DataMartObserver3());

        collector4.addObserver(new ExcelObserver());
        collector4.addObserver(new S3Observer());
        collector4.addObserver(new DataMartObserver1());
        collector4.addObserver(new DataMartObserver2());
        collector4.addObserver(new DataMartObserver3());

        collector1.execute();
        collector2.execute();
        collector3.execute();
        collector4.execute();
    }
}
```