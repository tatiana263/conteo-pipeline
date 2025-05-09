pipeline {
    agent any
    tools {
        jdk 'jdk-17'
    }
    stages {
        stage('Compilar') {
            steps {
                bat 'javac src/co/edu/unbosque/controller/conteoLetras.java -d target/classes'
            }
        }
        stage('Ejecutar') {
            steps {
                bat 'java -cp target/classes co.edu.unbosque.controller.conteoLetras'
            }
        }
    }
}
