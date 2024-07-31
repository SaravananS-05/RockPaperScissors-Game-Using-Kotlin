package com.example.rockpaperscissors

fun main(){
    var playerChoice = ""
    var computerChoice = ""
    println("Enter Your Choice Rock,Paper or Scissor: ")
    playerChoice = readln()
    while(playerChoice.lowercase() != "rock" && playerChoice.lowercase() != "paper" && playerChoice.lowercase() != "scissor"){
        println("Please enter the correct choice within these [Rock,Paper,Scissor]!")
        playerChoice = readln()
    }
    var cnum = (1..3).random()
    when(cnum)
    {
        1 -> {
            computerChoice = "rock"
        }
        2 -> {
            computerChoice = "paper"
        }
        3 -> {
            computerChoice = "scissor"
        }
    }
    println("Computer choice is $computerChoice")
    val res = when{
        playerChoice == computerChoice -> {
            "Tie"
        }
        playerChoice == "rock" && computerChoice == "scissor" -> "Player"
        playerChoice == "paper" && computerChoice == "rock" -> "Player"
        playerChoice == "scissor" && computerChoice == "paper" -> "Player"
        else -> "Compuer"
    }
    if(res=="Tie"){
        println("It's a tie!")
    }
    else{
        println("$res Won!")
    }

}