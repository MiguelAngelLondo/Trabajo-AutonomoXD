����   B �
      java/lang/Object <init> ()V  java/util/Hashtable
    key1  valor1
     put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;  key2  valor2  key3  valor3	      java/lang/System out Ljava/io/PrintStream; ! Elementos del Hashtable:
 # $ % & ' java/io/PrintStream println (Ljava/lang/String;)V
 # ) & * (Ljava/lang/Object;)V
 , - . / 0 java/lang/Integer valueOf (I)Ljava/lang/Integer; 2 Juan 4 Maria 6 Pedro
  8 9 : get &(Ljava/lang/Object;)Ljava/lang/Object;
 , < = > intValue ()I   @ A B makeConcatWithConstants '(Ljava/lang/String;I)Ljava/lang/String; D 
Elementos del Hashtable:
  F G H keySet ()Ljava/util/Set; J K L M N java/util/Set iterator ()Ljava/util/Iterator; P Q R S T java/util/Iterator hasNext ()Z P V W X next ()Ljava/lang/Object; Z java/lang/String
 Y \ / ] &(Ljava/lang/Object;)Ljava/lang/String;  _ A ` 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; b ejercisioss/Hastable12 Code LineNumberTable LocalVariableTable this Lejercisioss/Hastable12; main ([Ljava/lang/String;)V key Ljava/lang/String; args [Ljava/lang/String; hashK Ljava/util/Hashtable; 	hashtable edades nombre edad I LocalVariableTypeTable ;Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/String;>; =Ljava/util/Hashtable<Ljava/lang/Integer;Ljava/lang/Integer;>; <Ljava/util/Hashtable<Ljava/lang/String;Ljava/lang/Integer;>; StackMapTable m MethodParameters 
SourceFile Hastable12.java BootstrapMethods �  tiene  anios. �  :  �
 � � � A � $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses � %java/lang/invoke/MethodHandles$Lookup � java/lang/invoke/MethodHandles Lookup ! a           c   /     *� �    d        e        f g   	 h i  c      � Y� 	L+
� W+� W+� W�  � "� +� (� Y� 	M,� +
� +� W,� +� +� W,� +� +� W�  � "� ,� (� Y� 	N-1� +� W-3� +� W-5#� +� W3:-� 7� ,� ;6� � ?  � "� C� "-� E� I :� O � (� U � Y:� -� 7� [� ^  � "��Ա    d   b           #  +  2 ! : $ H % V & d ) l * s . { 1 � 2 � 3 � 5 � 6 � 7 � 8 � 9 � : � ; < e   H  �  j k    l m    � n o  : � p o  { � q o  � ` r k  � R s t  u       � n v  : � p w  { � q x  y    � �  z    Y P  � . {    l    |    } ~     �   �  � �   
  � � � 