# rabbitMQ-prototype

rabbitMQ試したのでメモ。Mac OS/Xで試しました。

### セットアップ
#### サーバインストール
Installing on Homebrew
	https://www.rabbitmq.com/install-homebrew.html


### 動かし方
#### サーバ起動
/usr/local/sbin/rabbitmq-server 

#### コンパイル＆パッケージ
mvn clean package

#### 受信プログラム起動
java -cp .:target/dependency/amqp-client-3.6.3.jar:target/rabbitMQ-prototype.jar com.example.Recv

#### メッセージ送信
java -cp .:target/dependency/amqp-client-3.6.3.jar:target/rabbitMQ-prototype.jar com.example.Send


### 参考
#### キュー確認
/usr/local/sbin/rabbitmqctl list_queues



