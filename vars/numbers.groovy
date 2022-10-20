def call (int number = '3')
    if (number % 2 == 0 ) {
    pipeline {
      agent any
      stages {
        stage('Primera etapa') {
          steps {
            echo "El número es par"
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Segunda etapa') {
          steps {
            echo "El número es impar"
          }
        }
      }
    }
  }
