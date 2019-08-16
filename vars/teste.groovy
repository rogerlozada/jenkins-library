
@Library('dharma-jenkins')

def call(String name = 'human') {
  echo "Hello, ${name}."
}

