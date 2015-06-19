package main

import scala.io.StdIn.readLine
import scala.util.Random

object ack {
  def main(args: Array[String]): Unit ={
    rps()
  }

  def rps(): Unit ={  //0 - Schere, 1 - Stein, 2 - Papier
    var playing = true
    var player = 0
    var com = 0
    do{
      val computer = new Random().nextInt(3)
      readLine("Schere, Stein oder Papier? (q to quit)") match {
        case "S" | "Schere" => computer match {
          case 0 => println("Schere vs Schere - kein Gewinner")
          case 1 => println("Schere vs Stein - Computer gewinnt"); com +=1
          case 2 => println("Schere vs Papier - du gewinnst"); player +=1
        }
        case "R" | "Stein" => computer match {
          case 0 => println("Stein vs Schere - du gewinnst"); player +=1
          case 1 => println("Stein vs Stein - kein Gewinner")
          case 2 => println("Stein vs Papier - Computer gewinnt"); com +=1
        }
        case "P" | "Papier" => computer match {
          case 0 => println("Papier vs Schere - Computer gewinnt"); com +=1
          case 1 => println("Papier vs Stein - du gewinnst"); player +=1
          case 2 => println("Papier vs Papier - kein Gewinner")
        }
        case "q" => playing = false
        case _ => println("keine gültige Eingabe")
      }
      println("Aktueller Spielstand: "+player+":"+com)
    }while(playing)
  }
}
