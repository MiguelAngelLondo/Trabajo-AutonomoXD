����   B G
      java/lang/Object <init> ()V  java/util/LinkedList
    Juan
     add (Ljava/lang/Object;)Z  María  Pedro	      java/lang/System out Ljava/io/PrintStream;  Elementos de la LinkedList:
      ! java/io/PrintStream println (Ljava/lang/String;)V
  # $ % iterator ()Ljava/util/Iterator; ' ( ) * + java/util/Iterator hasNext ()Z ' - . / next ()Ljava/lang/Object; 1 java/lang/String 3 ejercisioss/EstructuraDat8 Code LineNumberTable LocalVariableTable this Lejercisioss/EstructuraDat8; main ([Ljava/lang/String;)V nombre Ljava/lang/String; args [Ljava/lang/String; nombres Ljava/util/LinkedList; LocalVariableTypeTable *Ljava/util/LinkedList<Ljava/lang/String;>; StackMapTable MethodParameters 
SourceFile EstructuraDat8.java ! 2           4   /     *� �    5        6        7 8   	 9 :  4   �     H� Y� 	L+
� W+� W+� W� � +� "M,� & � ,� , � 0N� -� ���    5   & 	   0  3  4  5  8 % 9 = : D ; G < 6      =  ; <    H = >    @ ? @  A      @ ? B  C    � *  '�  D    =    E    F