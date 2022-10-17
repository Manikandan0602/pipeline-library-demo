#!/usr/bin/env groovy
def call(String name = 'mani'){
    pipeline{
        agent any
        tools{
            maven 'maven 3'
        }
        stages{
            stage (test){
                steps{
                    script{
                        sh 'mvn install'
                    }
                }
            }
        }
    }
}