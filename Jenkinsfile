pipeline {
    agent any
    tools {
        jdk 'jdk-17'
    }
    stages {

        stage('Análisis de Requisitos') {
            steps {
                echo ' Verificando archivos clave del proyecto...'
                bat '''
                    if not exist README.md exit 1
                    if not exist src\\co\\edu\\unbosque\\controller\\conteoLetras.java exit 1
                '''
                echo 'Archivos requeridos verificados.'
            }
        }

        stage('Desarrollo del Software') {
            steps {
                echo 'Preparando entorno de desarrollo...'
                bat '''
                    if exist target rmdir /S /Q target
                    mkdir target\\classes
                '''
                echo ' Estructura preparada.'
            }
        }

        stage('Pruebas') {
            steps {
                echo '🧪 Ejecutando pruebas simuladas...'
                bat '''
                    echo Probando funciones básicas...
                    REM simulamos prueba exitosa si el archivo existe
                    if not exist src\\co\\edu\\unbosque\\controller\\conteoLetras.java exit 1
                '''
                echo 'Pruebas simuladas pasadas.'
            }
        }

    stages {
        stage('Compilar') {
            steps {
                bat 'javac src/conteoLetras.java -d target/classes'
            }
        }
        stage('Ejecutar') {
            steps {
                bat 'java -cp target/classes conteoLetras'
            }
        }
    }
}
}
