#!/usr/bin/env groovy
def call(String name = 'mani'){
    pipeline{
        agent any
        stages{
            stage (test){
                steps{
                    echo "hello, ${name}"
                }
            }
        }
    }
}