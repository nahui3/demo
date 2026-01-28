import React from 'react'
import './App.css'
import { HelloNahui } from '@nahui3/web'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <h1>Компоненты @nahui3/web</h1>
        <div className="card">
          <HelloNahui name="NAHUI" />
          <p style={{ marginTop: 16 }}>
            Этот пример использует компонент <code>HelloNahui</code> из пакета
            <code> @nahui3/web</code>.
          </p>
        </div>
      </header>
    </div>
  )
}

export default App
