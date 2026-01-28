//
//  ContentView.swift
//  Demo NAHUI
//
//  Created by Sergey on 28.01.2026.
//

import SwiftUI
import NAHUI

struct ContentView: View {
    @State private var name: String = ""

    var body: some View {
        NavigationStack {
            VStack(spacing: 24) {
                SimpleTextFieldView(
                    text: $name,
                    title: "Имя",
                    placeholder: "Введите имя"
                )

                if !name.isEmpty {
                    Text("Вы ввели: \(name)")
                        .font(.title3.weight(.semibold))
                        .frame(maxWidth: .infinity, alignment: .leading)
                        .transition(.opacity.combined(with: .slide))
                } else {
                    Text("Начните вводить текст в поле выше")
                        .foregroundStyle(.secondary)
                        .frame(maxWidth: .infinity, alignment: .leading)
                }

                Spacer()
            }
            .padding(.horizontal, 20)
            .padding(.top, 32)
            .animation(.easeInOut(duration: 0.2), value: name)
            .navigationTitle("Demo NAHUI")
        }
    }
}

#Preview {
    ContentView()
}
