pipeline {
    agent any
    tools {
        jdk 'jdk-17'
    }
    stages {
        stage('Compilar') {
            steps {
                bat 'javac -d target/classes src/co/edu/unbosque/controller/conteoLetras.java'
            }
        }
        stage('Ejecutar') {
            steps {
                bat 'java -cp target/classes co.edu.unbosque.controller.conteoLetras'
            }
        }
    }
}
