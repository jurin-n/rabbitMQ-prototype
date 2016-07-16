# rabbitMQ-prototype

rabbitMQ試したのでメモ。Mac OS/Xで試しました。

### セットアップ
#### サーバインストール
Installing on Homebrew
	https://www.rabbitmq.com/install-homebrew.html


### 動かし方
#### サーバ起動
/usr/local/sbin/rabbitmq-server 

#### 受信プログラム起動
com.example.Recv.java 実行

#### メッセージ送信
com.example.Send.java 実行


### 参考
#### キュー確認
/usr/local/sbin/rabbitmqctl list_queues


