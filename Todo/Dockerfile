# ベースイメージとしてeclipse-temurinを使用
FROM eclipse-temurin:17-jdk-alpine

# 作業ディレクトリの作成
WORKDIR /app

# ビルドされたJARファイルを作業ディレクトリにコピー
COPY build/libs/*.jar app.jar

# アプリケーションを起動
ENTRYPOINT ["java","-jar","/app/app.jar"]
