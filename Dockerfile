FROM ubuntu:latest
LABEL authors="vigne"

ENTRYPOINT ["top", "-b"]