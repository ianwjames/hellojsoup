package org.wizzle.hellojsoup

import org.jsoup.Jsoup

fun main(args: Array<String>) {

    val doc = Jsoup.connect("http://www.javatpoint.com").get()

    val title = doc.title()

    println(title)

    val links = doc.select("a[href]")

    links.forEach { link -> println(link.attr("href")) }

    val keywords = doc.select("meta[name=keywords]").first().attr("content")

    println(keywords)

    val description = doc.select("meta[name=description]").get(0).attr("content")

    println(description)

    val meta = doc.select("meta")

    println(meta)

    val metaContent = meta.map { it.attr("content") }

    metaContent.forEach { println(it) }

}