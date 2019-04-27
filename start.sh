#!/bin/bash

function build() {
	source /etc/environment
	gradle build
}

function run() {
	java -jar build/libs/*
}

build
run
