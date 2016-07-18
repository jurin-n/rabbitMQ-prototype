# rabbitMQ-prototype

rabbitMQ試したのでメモ。Mac OS/Xで試しました。
チュートリアル(https://www.rabbitmq.com/getstarted.html)を試してみました。

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
java -cp .:target/dependency/amqp-client-3.6.3.jar:target/rabbitMQ-prototype.jar com.example.ReceiveLogs

#### メッセージ送信
java -cp .:target/dependency/amqp-client-3.6.3.jar:target/rabbitMQ-prototype.jar com.example.Send
java -cp .:target/dependency/amqp-client-3.6.3.jar:target/rabbitMQ-prototype.jar com.example.EmitLog "Sent Message One."

### 参考
#### キュー確認
/usr/local/sbin/rabbitmqctl list_queues
sudo /usr/local/sbin/rabbitmqctl list_queues name messages_ready messages_unacknowledged


