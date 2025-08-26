pipeline{
    agent none 
    stages{
        stage("Buld"){
            step{
                echo "This is Bulding process."
            }
        }

        stage("Test"){
            step{
                echo "This is Testing process."
            }
        }

        stage("Deploy"){
            step{
                echo "This is Deploying process."
            }
        }
        stage("Relase"){
            step{
                echo "This is Relasing process."
            }
        }
    }
}