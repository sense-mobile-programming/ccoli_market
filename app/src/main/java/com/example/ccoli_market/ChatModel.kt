package com.example.ccoli_market

import org.w3c.dom.Comment

class ChatModel (val users: HashMap<String, Boolean> = HashMap(),
                 val comments : HashMap<String, Comment> = HashMap()){
    class Comment(val uid: String? = null, val message: String? = null, val time: String? = null)
}