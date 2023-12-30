FROM ubuntu:latest
LABEL authors="ndmac"

ENTRYPOINT ["top", "-b"]