from tkinter.constants import RAISED
import cv2
import mediapipe as mp
import tkinter as tk
import _thread
import pdb
f1 = tk.Tk()
shownx = tk.StringVar()
showny = tk.StringVar()
shownz = tk.StringVar()

label1 = tk.Label(f1, textvariable=shownx, relief=RAISED, font=("Arial, 25"))
label2 = tk.Label(f1, textvariable=showny, relief=RAISED ,font=("Arial, 25"))
label3 = tk.Label(f1, textvariable=shownz, relief=RAISED ,font=("Arial, 25"))
label1.pack()
label2.pack()
label3.pack()

def Fuck(args):
  global f1
  global shownx
  global showny
  global shownz
  mp_drawing = mp.solutions.drawing_utils
  mp_drawing_styles = mp.solutions.drawing_styles
  mp_hands = mp.solutions.hands

  # For webcam input:
  cap = cv2.VideoCapture(0)

  with mp_hands.Hands(
          model_complexity=0,
          min_detection_confidence=0.5,
          min_tracking_confidence=0.5) as hands:
    while cap.isOpened():
      success, image = cap.read()
      if not success:
        print("Ignoring empty camera frame.")
        # If loading a video, use 'break' instead of 'continue'.
        continue

      # To improve performance, optionally mark the image as not writeable to
      # pass by reference.
      image.flags.writeable = False
      image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
      results = hands.process(image)
      
      if results.multi_hand_world_landmarks != None:
        a = results.multi_hand_landmarks[0].landmark[12]
        f1.title(str(a))
        shownx.set("{:.5f}".format(a.x))
        showny.set("{:.5f}".format(a.y))
        shownz.set("{:.5f}".format(a.z))

      # Draw the hand annotations on the image.
      image.flags.writeable = True
      image = cv2.cvtColor(image, cv2.COLOR_RGB2BGR)
      if results.multi_hand_landmarks:
        for hand_landmarks in results.multi_hand_landmarks:
          mp_drawing.draw_landmarks(
              image,
              hand_landmarks,
              mp_hands.HAND_CONNECTIONS,
              mp_drawing_styles.get_default_hand_landmarks_style(),
              mp_drawing_styles.get_default_hand_connections_style())
      # Flip the image horizontally for a selfie-view display.
      cv2.imshow('MediaPipe Hands', cv2.flip(image, 1))
      if cv2.waitKey(5) & 0xFF == 27:
        break
  cap.release()


_thread.start_new_thread(Fuck, ("F",))
f1.mainloop()