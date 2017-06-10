# coding=utf-8
from PIL import Image
import numpy as np
import os

class image_slicer:
    #define the size,step of a slide window:
    def __init__(self,width,length,step):
        self.width = width
        self.length = length
        self.step = step

    #choose which img to slice:
    def slice(self,img,img_name):
        os.makedirs('imgs/%s_sliced'%img_name)
        for i in range(int(img.size[0]/self.step)):
            for j in range(int(img.size[1]/self.step)):
                img_sliced = img.crop((i*self.step,j*self.step,i*self.step+self.width,j*self.step+self.length))
                self.process_img(img_sliced).save("imgs/%s_sliced/%s[%d,%d].jpg"%(img_name,img_name,i,j))
                #save
                #img_sliced.convert('L').save("pic/%s_sliced%d-%d.jpg"%(img_name,i,j))

    #to process img:
    def process_img(self,img):
        #convert pics to 'L' mode
        img_processed = img.convert('L')
        return img_processed

'''if __name__=="__main__":
    img = Image.open("C:/Users/龙飞/PycharmProjects/soccer_detect/pic/test.jpg")

    width = 10
    length = 10
'''
if __name__=="__main__":

    img = Image.open("C:/Users/龙飞/PycharmProjects/soccer_detect/imgs/test.jpg")
    image_slicer = image_slicer(300,300,300)
    image_slicer.slice(img,'test')