FROM ubuntu:latest
LABEL authors="stari"

ENTRYPOINT ["top", "-b"]