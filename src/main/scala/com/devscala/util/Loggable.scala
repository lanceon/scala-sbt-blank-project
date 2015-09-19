package com.devscala.util

import java.util.concurrent.TimeUnit

import org.slf4j.LoggerFactory

/**
 * Created by AZ on 20.09.2015.
 */
trait Loggable {

   val logger = LoggerFactory.getLogger(getClass)

   def logTime[T](msg: String)(code: => T): T = {
     val start = System.nanoTime()
     val res = code
     logger.info(s"Time taken by '$msg' is ${TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - start)} millis")
     res
   }

 }
